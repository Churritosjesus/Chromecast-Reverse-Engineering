.class final Lmy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lmx;


# direct methods
.method constructor <init>(Lmx;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lmy;->a:Lmx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 1057
    iget-object v0, v0, Lmx;->n:Landroid/widget/Button;

    .line 116
    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lmy;->a:Lmx;

    .line 2057
    iget-object v0, v0, Lmx;->p:Landroid/os/Message;

    .line 116
    if-eqz v0, :cond_1

    .line 117
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 3057
    iget-object v0, v0, Lmx;->p:Landroid/os/Message;

    .line 117
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v0

    .line 126
    :goto_0
    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 131
    :cond_0
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 10057
    iget-object v0, v0, Lmx;->K:Landroid/os/Handler;

    .line 131
    const/4 v1, 0x1

    iget-object v2, p0, Lmy;->a:Lmx;

    .line 11057
    iget-object v2, v2, Lmx;->b:Lny;

    .line 131
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 133
    return-void

    .line 118
    :cond_1
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 4057
    iget-object v0, v0, Lmx;->q:Landroid/widget/Button;

    .line 118
    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lmy;->a:Lmx;

    .line 5057
    iget-object v0, v0, Lmx;->s:Landroid/os/Message;

    .line 118
    if-eqz v0, :cond_2

    .line 119
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 6057
    iget-object v0, v0, Lmx;->s:Landroid/os/Message;

    .line 119
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v0

    goto :goto_0

    .line 120
    :cond_2
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 7057
    iget-object v0, v0, Lmx;->t:Landroid/widget/Button;

    .line 120
    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lmy;->a:Lmx;

    .line 8057
    iget-object v0, v0, Lmx;->v:Landroid/os/Message;

    .line 120
    if-eqz v0, :cond_3

    .line 121
    iget-object v0, p0, Lmy;->a:Lmx;

    .line 9057
    iget-object v0, v0, Lmx;->v:Landroid/os/Message;

    .line 121
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v0

    goto :goto_0

    .line 123
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
