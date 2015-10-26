.class final Lbns;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;)V
    .locals 0

    .prologue
    .line 865
    iput-object p1, p0, Lbns;->b:Lbmu;

    iput-object p2, p0, Lbns;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 868
    iget-object v0, p0, Lbns;->b:Lbmu;

    .line 1069
    iget-object v0, v0, Lbmu;->i:Landroid/os/Handler;

    .line 868
    iget-object v1, p0, Lbns;->a:Laow;

    .line 1528
    iget-object v1, v1, Laow;->r:Ljava/lang/Runnable;

    .line 868
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 869
    iget-object v0, p0, Lbns;->a:Laow;

    invoke-virtual {v0}, Laow;->i()V

    .line 870
    iget-object v0, p0, Lbns;->a:Laow;

    invoke-virtual {v0}, Laow;->j()V

    .line 871
    return-void
.end method
