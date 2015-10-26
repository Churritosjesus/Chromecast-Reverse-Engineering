.class final Lpd;
.super Liv;
.source "PG"


# instance fields
.field private synthetic a:Lpb;


# direct methods
.method constructor <init>(Lpb;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lpd;->a:Lpb;

    invoke-direct {p0}, Liv;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 158
    iget-object v0, p0, Lpd;->a:Lpb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpb;->a(Lpb;Lpp;)Lpp;

    .line 159
    iget-object v0, p0, Lpd;->a:Lpb;

    invoke-static {v0}, Lpb;->c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->requestLayout()V

    .line 160
    return-void
.end method
