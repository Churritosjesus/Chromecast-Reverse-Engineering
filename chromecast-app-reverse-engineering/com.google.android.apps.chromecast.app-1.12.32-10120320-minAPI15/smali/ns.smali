.class final Lns;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 638
    iput-object p1, p0, Lns;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 640
    iget-object v0, p0, Lns;->a:Lno;

    iget-object v0, v0, Lno;->q:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lns;->a:Lno;

    iget-object v1, v1, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    const/16 v2, 0x37

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 643
    return-void
.end method
