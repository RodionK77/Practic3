package Movables;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        if (!movementIsAllowed()) return;
        topLeft.y++;
        bottomRight.y++;
    }

    @Override
    public void moveDown() {
        if (!movementIsAllowed()) return;
        topLeft.y--;
        bottomRight.y--;
    }

    @Override
    public void moveLeft() {
        if (!movementIsAllowed()) return;
        topLeft.x--;
        bottomRight.x--;
    }

    @Override
    public void moveRight() {
        if (!movementIsAllowed()) return;
        topLeft.x++;
        bottomRight.x++;
    }

    private boolean movementIsAllowed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public String toString() {
        String topLeftStr = "x: " + topLeft.x + ", y = " + topLeft.y;
        String bottomRightStr = "x: " + bottomRight.x + ", y = " + bottomRight.y;
        return "topLeftStr: \n" + topLeftStr + "\nbottomRightStr: \n" + bottomRightStr
                + "\nxSpeed: " + topLeft.xSpeed + ", ySpeed: " + topLeft.ySpeed;
    }
}
