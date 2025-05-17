# Algorithms
### Two Pointer
- Traversing a linear structure
- O(n)
- Same direction 
  - Scanning data in a single pass
  - Slow pointer moves one step at a time
  - Fast pointer moves two steps
- Oppostie direction
  - Finding pairs or comparing elements
- Scan the start and end of a list
- Sorted list and need to find pairs
- Removing duplicates or filtering
```python
def two_pointer_template(input):
    # Initialize pointers
    i = 0
    j = len(input) - 1
    result = None

    # Iterate while pointers do not cross
    while i < j:
        # Process the elements at both pointers

        # Adjust the pointers based on specific conditions
        # i += 1 or j -= 1

        # Break or continue based on a condition if required

    # Return the final result or process output
    return result
```
---
### Sliding Window
- Window of elements in a data dynamically adjusting its size
- Find the shortest/longest/min/max of a subarray
- Subarray must satisfy some condition
```python
"""
A generic template for dynamic sliding window finding min window length
"""
def shortest_window(nums, condition):
    i = 0
    min_length = float('inf')
    result = None

    for j in range(len(nums)):
        # Expand the window
        # Add nums[j] to the current window logic

        # Shrink window as long as the condition is met
        while condition():  
            # Update the result if the current window is smaller
            if j - i + 1 < min_length:
                min_length = j - i + 1
                # Add business logic to update result

            # Shrink the window from the left
            # Remove nums[i] from the current window logic
            i += 1

    return result

"""
A generic template for dynamic sliding window finding max window length
"""
def longest_window(nums, condition):
    i = 0
    max_length = 0
    result = None

    for j in range(len(nums)):
        # Expand the window
        # Add nums[j] to the current window logic

        # Shrink the window if the condition is violated
        while not condition():  
            # Shrink the window from the left
            # Remove nums[i] from the current window logic
            i += 1

        # Update the result if the current window is larger
        if j - i + 1 > max_length:
            max_length = j - i + 1
            # Add business logic to update result

    return result

"""
A generic template for sliding window of fixed size
"""
def window_fixed_size(nums, k):
    i = 0
    result = None

    for j in range(len(nums)):
        # Expand the window
        # Add nums[j] to the current window logic

        # Ensure window has size of K
        if (j - i + 1) < k:
            continue

        # Update Result
        # Remove nums[i] from window
        # increment i to maintain fixed window size of length k
        i += 1

    return result

def slow_fast_pointers(head):
    # Initialize pointers
    slow = head
    fast = head
    result = None

    # move slow once, move fast twice
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        # update result based on custom logic
        # Example: if fast == slow then cycle is detected

    return result
```
---
### Binary Search
- Allows to find a target value in a sorted array by repeatedly dividing the sorted array in half
- O(logn)
- Any list if it is a monotonic function
- Input is sorted and need to find a number
- Find the position of insertion in a sorted list
- Handling dups in sorted arrays
- Searching in rotated sorted arrays
```python
"""
Classic binary search algorithm that finds a target value
"""
def classic_binary_search(array, target):
    left, right = 0, len(array)-1
    while left <= right:
        mid = left + (right - left) // 2
        if array[mid] == target:
            return mid
        elif array[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

"""
A generic template for binary search such that the returned value
is the minimum index where condition(k) is true

Example 1:
array = [1,2,2,2,3]
target = 2
binary_search(array, lambda mid: array[mid] >= target) --> 1

Example 2:
array = [1,2,2,2,3]
target = 2
binary_search(array, lambda mid: array[mid] > target) --> 4
"""
def binary_search(array, condition):
    left, right = 0, len(array)
    while left < right:
        mid = left + (right - left) // 2
        if condition(mid):
            right = mid
        else:
            left = mid + 1
    return left

"""
Binary search algorithm that can search a rotated array
by selected the appropriate half to scan at each iteration
"""
def binary_search_rotated_array(array, target):
    left, right = 0, len(array)-1

    while left <= right:
        mid = (left + right) // 2
        if array[mid] == target:
            return mid

        # left side sorted
        if array[left] <= array[mid]:
            # if target is contained in left sorted side, go left
            if array[left] <= target <= array[mid]:
                right = mid - 1
            else:
                left = mid + 1

        # right side sorted
        else:
            # if target is contained in right sorted side, go right
            if array[mid] <= target <= array[right]:
                left = mid + 1
            else:
                right = mid - 1

    return -1
```
---
### Breadth-First Search
- Explore nodes level by level
- Queue
- Best for shortest path
```python
from collections import deque

def bfs_traversal(root):
    if not root:
        return []

    result = []
    queue = deque([root])
    while len(queue) > 0:
        level = []
        for i in range(len(queue)):
            node = queue.popleft()
            level.append(node.val)

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        result.append(level)
    
    return result
```
---
### Depth-First Search
- Dives into one path as possible
- Stack/Recursion
- Exploring for all paths
```python
def dfs(root, target):
    if root is None:
        return None
    if root.val == target:
        return root
    # return non-null return value from the recursive calls
    left = dfs(root.left, target)
    if left is not None:
        return left

    # at this point, we know left is null, and right could be null or non-null
    # we return right child's recursive call result directly because
    # - if it's non-null we should return it
    # - if it's null, then both left and right are null, we want to return null
    return dfs(root.right, target)
    # the code can be shortened to: return dfs(root.left, target) or dfs(root.right, target)
```
---
### Backtracking
- Explore all possible solutions by making series of decisions
```python
"""
Generic backtracking template.
"""
def backtrack(candidates, curPath):
    # Base case: Check if the solution meets the problem's criteria
    if is_solution(curPath):
        process_solution(curPath)
        return

    for candidate in candidates:
        if is_valid(candidate, curPath):
            # Take the current candidate
            curPath.append(candidate)

            # Recurse to explore further solutions
            backtrack(candidates, curPath)

            # Undo the choice (backtrack)
            curPath.pop()
```
---
### Priority Queue (Heap)
- Top K
- Tree where elements are organized in a specific way
- Min Heap
  - Smallest value is at the root and each parent is smaller than its children
  - K Largest
- Max Heap
  - Opposite of min heap
  - K Smallest
```python
"""
A generic template for the Top K Smallest elements.
"""
import heapq
def top_k_smallest_elements(arr, k):
    if k <= 0 or not arr:
        return []

    # Use a max heap to maintain the k smallest elements
    max_heap = []

    for num in arr:
        # Python does not have a maxHeap, only min Heap
        # Therefore, negate the num to simulate a max heap
        heapq.heappush(max_heap, -num)
        if len(max_heap) > k:
            heapq.heappop(max_heap)

    # Convert back to positive values and return
    return [-x for x in max_heap]

"""
A generic template for the Top K Largest elements.
"""
import heapq
def top_k_largest_elements(arr, k):
    if k <= 0 or not arr:
        return []

    # Use a min heap to maintain the k largest elements
    min_heap = []

    for num in arr:
        heapq.heappush(min_heap, num)
        if len(min_heap) > k:
            heapq.heappop(min_heap)

    return min_heap
```
---
### Bit Manipulation
- Count number of 0 or 1 bits in a number
- Add numbers without using addition or subtraciton
- Find a missing number in a list
```python
"""
Useful bitwise operators for LeetCode
"""
def binary_operators():
    return {
        "AND": a & b,
        "OR": a | b,
        "XOR": a ^ b,
        "NOT": ~a, # ~a = -a-1 in python
        "Left Shift (a << b)": a << b,  # left shift 'a' by 'b' bits
        "Right Shift (a >> b)": a >> b,  # right shift 'a' by 'b' bits
        "Mask": a & 1 # gives you the least significant bit of a
    }
```