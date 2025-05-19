graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': [],
    'F': []
}

def dfs(graph, node, visited=[]):
    if node not in visited:
        print(node, end=' ')
        visited.append(node)
        for neighbor in graph[node]:
            dfs(graph, neighbor, visited)

print("DFS:")
dfs(graph, 'A')