import heapq


def prims_algorithm(graph, start_node):
    # graph is an adjacency list: {node: [(weight, neighbor), ...]}
    mst_edges = []
    visited = set([start_node])

    # edges list stores (weight, from_node, to_node)
    edges = []
    for weight, neighbor in graph[start_node]:
        heapq.heappush(edges, (weight, start_node, neighbor))

    total_cost = 0

    while edges:
        weight, u, v = heapq.heappop(edges)

        if v not in visited:
            visited.add(v)
            mst_edges.append((u, v, weight))
            total_cost += weight

            # Add all edges from the newly added vertex to the heap
            for next_weight, neighbor in graph[v]:
                if neighbor not in visited:
                    heapq.heappush(edges, (next_weight, v, neighbor))

    return mst_edges, total_cost


# Example Graph
example_graph = {
    0: [(4, 1), (8, 7)],
    1: [(4, 0), (8, 2), (11, 7)],
    2: [(8, 1), (7, 3), (4, 5), (2, 8)],
    3: [(7, 2), (9, 4), (14, 5)],
    4: [(9, 3), (10, 5)],
    5: [(4, 2), (14, 3), (10, 4), (2, 6)],
    6: [(2, 5), (1, 7), (6, 8)],
    7: [(8, 0), (11, 1), (1, 6), (7, 8)],
    8: [(2, 2), (6, 6), (7, 7)]
}

mst, cost = prims_algorithm(example_graph, 0)
print(f"Total MST Cost: {cost}")