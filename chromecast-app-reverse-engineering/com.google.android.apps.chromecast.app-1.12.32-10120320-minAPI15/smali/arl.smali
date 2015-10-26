.class final Larl;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:Lark;


# direct methods
.method constructor <init>(Lark;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Larl;->a:Lark;

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Larl;->a:Lark;

    invoke-static {v0}, Lark;->a(Lark;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 140
    iget-object v0, p0, Larl;->a:Lark;

    invoke-static {v0}, Lark;->a(Lark;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 141
    iget-object v0, p0, Larl;->a:Lark;

    invoke-static {v0}, Lark;->a(Lark;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 142
    iget-object v0, p0, Larl;->a:Lark;

    invoke-static {v0}, Lark;->a(Lark;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 143
    return-void
.end method
