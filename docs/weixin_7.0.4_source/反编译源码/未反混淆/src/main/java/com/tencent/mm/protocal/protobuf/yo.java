package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class yo extends bsr {
    public int vFH;
    public String vMR;
    public b wcJ;
    public b wer;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11747);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vMR != null) {
                aVar.e(2, this.vMR);
            }
            aVar.iz(3, this.vFH);
            if (this.wer != null) {
                aVar.c(4, this.wer);
            }
            if (this.wcJ != null) {
                aVar.c(5, this.wcJ);
            }
            AppMethodBeat.o(11747);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vMR != null) {
                ix += e.a.a.b.b.a.f(2, this.vMR);
            }
            ix += e.a.a.b.b.a.bs(3, this.vFH);
            if (this.wer != null) {
                ix += e.a.a.b.b.a.b(4, this.wer);
            }
            if (this.wcJ != null) {
                ix += e.a.a.b.b.a.b(5, this.wcJ);
            }
            AppMethodBeat.o(11747);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(11747);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            yo yoVar = (yo) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        yoVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(11747);
                    return 0;
                case 2:
                    yoVar.vMR = aVar3.BTU.readString();
                    AppMethodBeat.o(11747);
                    return 0;
                case 3:
                    yoVar.vFH = aVar3.BTU.vd();
                    AppMethodBeat.o(11747);
                    return 0;
                case 4:
                    yoVar.wer = aVar3.BTU.emu();
                    AppMethodBeat.o(11747);
                    return 0;
                case 5:
                    yoVar.wcJ = aVar3.BTU.emu();
                    AppMethodBeat.o(11747);
                    return 0;
                default:
                    AppMethodBeat.o(11747);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11747);
            return -1;
        }
    }
}
