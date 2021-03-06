package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class jc extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                k = c.a(k, looper);
                k.setColor(-8683387);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(48.0f, 80.0f);
                l.cubicTo(40.60533f, 80.0f, 33.802223f, 77.48534f, 28.383556f, 73.27333f);
                l.lineTo(73.27333f, 28.383556f);
                l.cubicTo(77.48534f, 33.802223f, 80.0f, 40.60533f, 80.0f, 48.0f);
                l.cubicTo(80.0f, 65.67289f, 65.67289f, 80.0f, 48.0f, 80.0f);
                l.moveTo(16.0f, 48.0f);
                l.cubicTo(16.0f, 30.326666f, 30.326666f, 16.0f, 48.0f, 16.0f);
                l.cubicTo(55.39467f, 16.0f, 62.197777f, 18.514668f, 67.61645f, 22.726667f);
                l.lineTo(22.726667f, 67.61645f);
                l.cubicTo(18.514668f, 62.197777f, 16.0f, 55.39467f, 16.0f, 48.0f);
                l.moveTo(70.627556f, 25.372889f);
                l.lineTo(70.62711f, 25.372444f);
                l.lineTo(70.627556f, 25.372889f);
                l.moveTo(48.0f, 8.0f);
                l.cubicTo(25.908443f, 8.0f, 8.0f, 25.908443f, 8.0f, 48.0f);
                l.cubicTo(8.0f, 70.09155f, 25.908443f, 88.0f, 48.0f, 88.0f);
                l.cubicTo(70.09155f, 88.0f, 88.0f, 70.09155f, 88.0f, 48.0f);
                l.cubicTo(88.0f, 25.908443f, 70.09155f, 8.0f, 48.0f, 8.0f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
