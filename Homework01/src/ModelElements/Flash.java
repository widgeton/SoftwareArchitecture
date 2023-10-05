package ModelElements;

public class Flash {
    Point3D Location;
    Angle3D Angle;
    Color Color;
    float Power;

    public Flash(Point3D Location, Angle3D Angle, Color Color, float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D angle3d) {

    }

    public void Move(Point3D point3d) {

    }
}
