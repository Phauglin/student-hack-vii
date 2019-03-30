public class MichaelPleaseListenToUs
{
  private final int gridSize;
  private final Cell[][] grid;

  public MichaelPleaseListenToUs(int gridSize)
  {
    this.gridSize = gridSize;
    grid = new Cell[gridSize][gridSize];
  }

  for(int row = 0; row < gridSize; row++)
  {
    for(int column = 0; column < gridSize; column++)
    {
      grid[row][column] = new Cell();
    }
  }
}
