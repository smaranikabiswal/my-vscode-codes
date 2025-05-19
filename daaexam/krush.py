edges = [(0, 1, 10), (0, 2, 6), (0, 3, 5), (1, 3, 15), (2, 3, 4)]
edges.sort(key=lambda x: x[2])
arr = [i for i in range(4)]

def find(x):
    if arr[x] != x:
        arr[x] = find(arr[x])
    return arr[x]

def union(x, y):
    arr[find(x)] = find(y)

print("MST edges:")
for u, v, w in edges:
    if find(u) != find(v):
        print(f"{u} - {v} = {w}")
        union(u, v)