.class final Lawo;
.super Lzf;
.source "PG"


# instance fields
.field private synthetic a:I


# direct methods
.method constructor <init>(Lawn;I)V
    .locals 0

    .prologue
    .line 66
    iput p2, p0, Lawo;->a:I

    invoke-direct {p0}, Lzf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lawo;->a:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 71
    return-void
.end method
