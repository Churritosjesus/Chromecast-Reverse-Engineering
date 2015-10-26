.class final Lpe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Liw;


# instance fields
.field private synthetic a:Lpb;


# direct methods
.method constructor <init>(Lpb;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lpe;->a:Lpb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lpe;->a:Lpb;

    invoke-static {v0}, Lpb;->c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 168
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 169
    return-void
.end method
