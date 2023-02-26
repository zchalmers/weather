package com.weather.server.service;


import com.weather.server.service.model.forecast.Astro;
import com.weather.server.service.model.forecast.Day;
import com.weather.server.service.model.forecast.ForecastDTO;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageDrawing{

    public static void draw (ForecastDTO forecast) throws IOException {
        File image = new File("C:\\Users\\zchal\\CODING\\gs-spring-boot\\complete\\src\\main\\java\\com\\example\\springboot\\service\\pictures\\newSunnyDay.JPG");
        BufferedImage buffImage = ImageIO.read(image);
        Graphics graphics = buffImage.getGraphics();

        Day day = forecast.getForecast().getForecastday().get(0).getDay();
        String name = forecast.getLocation().getName();
        String current = String.valueOf(forecast.getCurrent().getTemp_f());
        String highLow = String.valueOf(day.getMaxtemp_f()) + "/" + String.valueOf(day.getMintemp_f());
        String rain = String.valueOf(day.getDaily_chance_of_rain());
        String uv = String.valueOf(day.getUv());
        Astro astro = forecast.getForecast().getForecastday().get(0).getAstro();


        Rectangle nameBox = new Rectangle(40,80,410,55);
        Rectangle currentBox = new Rectangle(40, 335, 175, 160);
        Rectangle highLowNameBox = new Rectangle(50, 545, 210, 130);
        Rectangle highLowBox = new Rectangle(50, 620, 210, 130);
        Rectangle rainBox = new Rectangle(390, 545, 210, 60);
        Rectangle uvBox = new Rectangle(390, 620, 210, 50);
        Rectangle sunRiseBox = new Rectangle(715,530,255, 60);
        Rectangle moonRiseBox = new Rectangle(715, 590, 255, 60);
        Rectangle sunSetBox = new Rectangle(715, 650, 255, 60);

        Map<Rectangle, String> map = new HashMap<>();
        map.put(nameBox, name);
        map.put(currentBox, current + "°F");
        map.put(highLowNameBox, "High/Low");
        map.put(highLowBox, highLow);
        map.put(rainBox,"Rain%: " + rain);
        map.put(uvBox, "UV: " +  uv);
        map.put(sunRiseBox, "Sunrise: " + astro.getSunrise());
        map.put(moonRiseBox, "Moonrise: " +  astro.getMoonrise());
        map.put(sunSetBox, "Sunset: " + astro.getSunset());

        Font font = new Font("Arial", Font.BOLD, 20);
        Color color = Color.darkGray;

        graphics.setFont(font);
        graphics.setColor(color);

        for (Map.Entry<Rectangle, String> entry : map.entrySet()){
            Rectangle temp = entry.getKey();
            String tempS = entry.getValue();
            int fontSize = findFontSize(graphics, tempS, temp);
            Font fontTemp = font.deriveFont(fontSize);
            graphics.drawString(tempS, (int) temp.getX(), (int) temp.getY());
        }

        System.out.println("Input image dimensions: " + buffImage.getWidth() + "x" + buffImage.getHeight());
        for (Rectangle rect : map.keySet()) {
            System.out.println("Drawing text '" + map.get(rect) + "' in rectangle " + rect);
        }
        System.out.println("Font: " + font);
        System.out.println("Color: " + color);

        File output = new File("C:\\Users\\zchal\\CODING\\gs-spring-boot\\complete\\src\\main\\java\\com\\example\\springboot\\service\\pictures\\modSunnyDay.JPG");
        ImageIO.write(buffImage, "jpg", output);
        graphics.dispose();
    }

    public static int findFontSize(Graphics g2d, String text, Rectangle rect) {
        // Set the initial font size range to search
        int minSize = 1;
        int maxSize = 100;

        // Loop until the range has converged on a single size
        while (minSize <= maxSize) {
            // Calculate the midpoint size to try
            int size = (minSize + maxSize) / 2;

            // Set the font and measure the text
            Font font = new Font("Arial", Font.PLAIN, size);
            g2d.setFont(font);
            FontMetrics fm = g2d.getFontMetrics();
            int textWidth = fm.stringWidth(text);
            int textHeight = fm.getHeight();

            // Check if the text fits within the rectangle
            if (textWidth <= rect.width && textHeight <= rect.height) {
                // If it fits, try a larger font size
                minSize = size + 1;
            } else {
                // If it doesn't fit, try a smaller font size
                maxSize = size - 1;
            }
        }

        // Return the largest font size that fits within the rectangle
        return maxSize;
    }
}
