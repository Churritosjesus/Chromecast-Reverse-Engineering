.class final Lamh;
.super Lzf;
.source "PG"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(Lama;II)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lzf;-><init>()V

    .line 93
    iput p2, p0, Lamh;->b:I

    .line 94
    iput p3, p0, Lamh;->a:I

    .line 95
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lamh;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 101
    iget v0, p0, Lamh;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 102
    iget v0, p0, Lamh;->b:I

    shl-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 103
    iget v0, p0, Lamh;->b:I

    shl-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 104
    return-void
.end method
