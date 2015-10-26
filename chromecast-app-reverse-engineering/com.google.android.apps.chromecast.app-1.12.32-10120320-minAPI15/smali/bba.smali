.class final Lbba;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:I


# direct methods
.method constructor <init>(Lbaz;II)V
    .locals 0

    .prologue
    .line 65
    iput p2, p0, Lbba;->a:I

    iput p3, p0, Lbba;->b:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 69
    iget v0, p0, Lbba;->a:I

    shl-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 70
    instance-of v0, p2, Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    .line 71
    iget v0, p0, Lbba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 72
    iget v0, p0, Lbba;->b:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 74
    :cond_0
    return-void
.end method
