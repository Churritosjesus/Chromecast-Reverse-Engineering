.class Lnl;
.super Lno;
.source "PG"


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Lng;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Lno;-><init>(Landroid/content/Context;Landroid/view/Window;Lng;)V

    .line 29
    return-void
.end method


# virtual methods
.method final b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    .line 34
    invoke-super {p0, p1, p2, p3, p4}, Lno;->b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 45
    :goto_0
    return-object v0

    .line 40
    :cond_0
    iget-object v0, p0, Lnl;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/view/LayoutInflater$Factory2;

    if-eqz v0, :cond_1

    .line 41
    iget-object v0, p0, Lnl;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/view/LayoutInflater$Factory2;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
