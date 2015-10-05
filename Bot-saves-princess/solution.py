#!/usr/bin/python
def displayPathtoPrincess(n,grid):
    n = n - 1
    i = 0
    while i <= n:
        row = grid[i]
        if('p' in row):
            j = row.index('p')
            break
        i += 1

    v = int(n/2 - i)
    if(v > 0):
        v_move = 'UP\n'
    else:
        v_move = 'DOWN\n'
        
    h = int(n/2 - j)
    if(h > 0):
        h_move = 'LEFT\n'
    else:
        h_move = 'RIGHT\n'
    moves = v_move * abs(v) + h_move * abs(h)
    return(moves)
    
#print all the moves here
m = int(input())
grid = [] 
for i in range(0, m): 
    grid.append(input().strip())

print(displayPathtoPrincess(m,grid))
