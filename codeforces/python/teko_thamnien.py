def solve(n, year):
    pair = list(enumerate(year))
    pair.sort(key=lambda x: x[1], reverse=True)
    result = {}
    for i, p in enumerate(pair):
        result[p[0]] = len(pair) - i - 1

    return list(map(lambda e: result[e[0]], enumerate(year)))


# print(solve(4, [110, 120, 130, 140]))
print(solve(4, [111, 110, 130, 140]))
