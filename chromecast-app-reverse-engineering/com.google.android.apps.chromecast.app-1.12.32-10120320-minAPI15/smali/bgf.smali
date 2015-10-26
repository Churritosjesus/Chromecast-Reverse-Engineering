.class final Lbgf;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Lbge;I)V
    .locals 0

    .prologue
    .line 82
    iput p2, p0, Lbgf;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lbgf;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 87
    iget v0, p0, Lbgf;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 88
    iget v0, p0, Lbgf;->a:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 89
    iget v0, p0, Lbgf;->a:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 90
    return-void
.end method
