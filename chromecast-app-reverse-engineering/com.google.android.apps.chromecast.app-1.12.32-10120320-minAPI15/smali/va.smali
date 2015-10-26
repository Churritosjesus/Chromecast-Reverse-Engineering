.class final Lva;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Luz;


# direct methods
.method constructor <init>(Luz;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lva;->a:Luz;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lva;->a:Luz;

    invoke-static {v0}, Luz;->a(Luz;)V

    .line 143
    return-void
.end method
