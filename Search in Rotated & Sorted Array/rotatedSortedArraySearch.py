def rotatedSortedArraySearch(nums, target):
    if not nums: return -1

    left = 0
    right = len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid

        elif nums[mid] < nums[right]:
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1

        else:
            if nums[mid] > target >= nums[left]:
                right = mid - 1
            else:
                left = mid + 1

    return -1


if __name__ == "__main__":

    # Input
    nums = [4, 5, 6, 7, 0, 1, 2]
    target = 0

    print(rotatedSortedArraySearch(nums, target))
