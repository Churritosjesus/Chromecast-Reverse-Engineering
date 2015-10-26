.class final Lxo;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Lzr;

.field public b:I

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method constructor <init>(Lzr;IIII)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lxo;->a:Lzr;

    .line 58
    iput p2, p0, Lxo;->b:I

    .line 59
    iput p3, p0, Lxo;->c:I

    .line 60
    iput p4, p0, Lxo;->d:I

    .line 61
    iput p5, p0, Lxo;->e:I

    .line 62
    return-void
.end method
