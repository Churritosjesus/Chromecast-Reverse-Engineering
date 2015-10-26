.class public final Lavw;
.super Lavr;
.source "PG"


# instance fields
.field final b:Lavx;

.field final c:I


# direct methods
.method public constructor <init>(Lavx;I)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lavr;-><init>(I)V

    .line 24
    iput p2, p0, Lavw;->c:I

    .line 25
    iput-object p1, p0, Lavw;->b:Lavx;

    .line 26
    return-void
.end method
