.class final Lyk;
.super Landroid/database/DataSetObserver;
.source "PG"


# instance fields
.field private synthetic a:Lyc;


# direct methods
.method constructor <init>(Lyc;)V
    .locals 0

    .prologue
    .line 1703
    iput-object p1, p0, Lyk;->a:Lyc;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .prologue
    .line 1706
    iget-object v0, p0, Lyk;->a:Lyc;

    .line 1760
    iget-object v0, v0, Lyc;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    .line 1706
    if-eqz v0, :cond_0

    .line 1708
    iget-object v0, p0, Lyk;->a:Lyc;

    invoke-virtual {v0}, Lyc;->c()V

    .line 1710
    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .prologue
    .line 1714
    iget-object v0, p0, Lyk;->a:Lyc;

    invoke-virtual {v0}, Lyc;->a()V

    .line 1715
    return-void
.end method
