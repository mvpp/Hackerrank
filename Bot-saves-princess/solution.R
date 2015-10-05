require(stringr)
# Enter your code here. Read input from STDIN. Print output to STDOUT
excape <- function(input){
    grid <- suppressWarnings(readLines(file(input)))
    n <- as.numeric(grid[1])
    l <- str_locate(grid, "p")[, 1]
    
    v <- which(!is.na(l)) - 1
    h <- l[v + 1]
    
    center <- (n + 1) / 2
    v_moves <- center - v
    h_moves <- center - h
    
    direction_v <- ifelse(v_moves > 0, "UP\n", "DOWN\n")
    direction_h <- ifelse(h_moves > 0, "LEFT\n", "RIGHT\n")
    
    result <- paste0(rep(direction_v, abs(v_moves)), rep(direction_h, abs(h_moves)), collapse = "")
    cat(result)
}

stdout <- excape("stdin")
