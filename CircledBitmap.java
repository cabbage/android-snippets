    public static Bitmap getCircleShape(Bitmap pImage, int pDiameter) {
        Logger.v(LOG_TAG, "Creating circle shape image with diameter: " + pDiameter);
        Bitmap targetBitmap = Bitmap.createBitmap(pDiameter, pDiameter, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(targetBitmap);
        Path path = new Path();
        path.addCircle(((float) pDiameter - 1) / 2, ((float) pDiameter - 1) / 2,
                (Math.min(((float) pDiameter), ((float) pDiameter)) / 2), Path.Direction.CCW);

        canvas.clipPath(path);
        canvas.drawBitmap(pImage, new Rect(0, 0, pImage.getWidth(), pImage.getHeight()), new Rect(
                0, 0, pDiameter, pDiameter), null);
        return targetBitmap;
    }
