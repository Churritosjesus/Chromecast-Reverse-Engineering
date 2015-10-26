.class final Laxt;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Laxq;I)V
    .locals 0

    .prologue
    .line 339
    iput p2, p0, Laxt;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 343
    iget v0, p0, Laxt;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 344
    iget v0, p0, Laxt;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 345
    return-void
.end method
