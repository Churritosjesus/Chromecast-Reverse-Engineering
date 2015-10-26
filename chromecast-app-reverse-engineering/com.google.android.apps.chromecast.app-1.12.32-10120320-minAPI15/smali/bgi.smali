.class final Lbgi;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Lbgh;I)V
    .locals 0

    .prologue
    .line 57
    iput p2, p0, Lbgi;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lbgi;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 62
    iget v0, p0, Lbgi;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 63
    return-void
.end method
