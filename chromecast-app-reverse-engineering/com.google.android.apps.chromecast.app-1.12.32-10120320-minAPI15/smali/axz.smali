.class final Laxz;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Laxy;I)V
    .locals 0

    .prologue
    .line 59
    iput p2, p0, Laxz;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Laxz;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 64
    iget v0, p0, Laxz;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 65
    iget v0, p0, Laxz;->a:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 66
    iget v0, p0, Laxz;->a:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 67
    return-void
.end method
