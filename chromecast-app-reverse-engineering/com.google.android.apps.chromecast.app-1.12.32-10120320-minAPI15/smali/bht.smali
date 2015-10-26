.class final Lbht;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 870
    iput-object p1, p0, Lbht;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 873
    iget-object v0, p0, Lbht;->a:Lbhf;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 873
    iget-object v1, p0, Lbht;->a:Lbhf;

    .line 2612
    iget-object v1, v1, Lj;->y:Lm;

    .line 874
    invoke-static {v1}, Lblf;->R(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 873
    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 875
    iget-object v1, p0, Lbht;->a:Lbhf;

    invoke-virtual {v1, v0}, Lbhf;->a(Landroid/content/Intent;)V

    .line 876
    return-void
.end method
