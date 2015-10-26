.class final Lbgc;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Lbgb;I)V
    .locals 0

    .prologue
    .line 55
    iput p2, p0, Lbgc;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lbgc;->a:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 60
    return-void
.end method
