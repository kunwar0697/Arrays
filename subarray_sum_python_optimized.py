
def subarraySum(nums, k):
    from collections import defaultdict
    count = 0
    curr_sum = 0
    prefix_sum = defaultdict(int)
    prefix_sum[0] = 1

    for num in nums:
        curr_sum += num
        count += prefix_sum[curr_sum - k]
        prefix_sum[curr_sum] += 1

    return count
