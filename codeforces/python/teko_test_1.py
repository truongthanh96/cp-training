import math


def solve(n, c, t, p):
    loop_range = n - c
    max_candies = None
    for start_index in range(0, n, loop_range):
        end_index = start_index + loop_range
        candies = sum(p[start_index:end_index])
        if max_candies is None or candies > max_candies:
            max_candies = candies
    result = int(math.ceil(max_candies * 1.0 / t))
    return result


# assert solve(5, 3, 4, [5, 8, 3, 10, 7]) == 4
# assert solve(5, 3, 4, [5, 5, 5, 5, 7]) == 3
assert solve(6, 3, 1, [1, 1, 1, 1, 1, 1]) == 2
