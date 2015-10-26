.class public abstract Lyq;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Lzh;

.field b:I


# direct methods
.method private constructor <init>(Lzh;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/high16 v0, -0x80000000

    iput v0, p0, Lyq;->b:I

    .line 45
    iput-object p1, p0, Lyq;->a:Lzh;

    .line 46
    return-void
.end method

.method synthetic constructor <init>(Lzh;B)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lyq;-><init>(Lzh;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 68
    const/high16 v0, -0x80000000

    iget v1, p0, Lyq;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lyq;->e()I

    move-result v0

    iget v1, p0, Lyq;->b:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public abstract a(Landroid/view/View;)I
.end method

.method public abstract a(I)V
.end method

.method public abstract b()I
.end method

.method public abstract b(Landroid/view/View;)I
.end method

.method public abstract c()I
.end method

.method public abstract c(Landroid/view/View;)I
.end method

.method public abstract d()I
.end method

.method public abstract d(Landroid/view/View;)I
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
