.class final Lbhe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private synthetic a:Landroid/widget/ImageView;

.field private synthetic b:Lbhd;


# direct methods
.method constructor <init>(Lbhd;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lbhe;->b:Lbhd;

    iput-object p2, p0, Lbhe;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 89
    iget-object v0, p0, Lbhe;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    .line 90
    iget-object v1, p0, Lbhe;->a:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    .line 91
    iget-object v2, p0, Lbhe;->b:Lbhd;

    invoke-static {v2}, Lbhd;->a(Lbhd;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v3, v3, v0, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 92
    const/4 v0, 0x1

    return v0
.end method
