.class final Lsp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lsm;


# direct methods
.method constructor <init>(Lsm;)V
    .locals 0

    .prologue
    .line 565
    iput-object p1, p0, Lsp;->a:Lsm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 569
    iget-object v0, p0, Lsp;->a:Lsm;

    invoke-static {v0}, Lsm;->a(Lsm;)Lxu;

    move-result-object v0

    invoke-virtual {v0}, Lxu;->getChildCount()I

    move-result v3

    move v2, v1

    .line 570
    :goto_0
    if-ge v2, v3, :cond_1

    .line 571
    iget-object v0, p0, Lsp;->a:Lsm;

    invoke-static {v0}, Lsm;->a(Lsm;)Lxu;

    move-result-object v0

    invoke-virtual {v0, v2}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 572
    if-ne v4, p1, :cond_0

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setSelected(Z)V

    .line 570
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 572
    goto :goto_1

    .line 574
    :cond_1
    return-void
.end method
