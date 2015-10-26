.class public final Lxs;
.super Lzi;
.source "PG"


# instance fields
.field a:I

.field b:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 862
    invoke-direct {p0, v0, v0}, Lzi;-><init>(II)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Lxs;->a:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Lxs;->b:I

    .line 863
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 858
    invoke-direct {p0, p1, p2}, Lzi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Lxs;->a:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Lxs;->b:I

    .line 859
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 870
    invoke-direct {p0, p1}, Lzi;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Lxs;->a:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Lxs;->b:I

    .line 871
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 866
    invoke-direct {p0, p1}, Lzi;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Lxs;->a:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Lxs;->b:I

    .line 867
    return-void
.end method

.method static synthetic a(Lxs;)I
    .locals 1

    .prologue
    .line 846
    iget v0, p0, Lxs;->a:I

    return v0
.end method

.method static synthetic a(Lxs;I)I
    .locals 0

    .prologue
    .line 846
    iput p1, p0, Lxs;->b:I

    return p1
.end method

.method static synthetic b(Lxs;)I
    .locals 1

    .prologue
    .line 846
    iget v0, p0, Lxs;->b:I

    return v0
.end method

.method static synthetic b(Lxs;I)I
    .locals 0

    .prologue
    .line 846
    iput p1, p0, Lxs;->a:I

    return p1
.end method
