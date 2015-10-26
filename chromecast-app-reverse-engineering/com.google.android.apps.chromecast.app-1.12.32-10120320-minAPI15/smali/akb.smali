.class final Lakb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lajf;


# instance fields
.field private synthetic a:Lakl;

.field private synthetic b:Laka;


# direct methods
.method constructor <init>(Laka;Lakl;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lakb;->b:Laka;

    iput-object p2, p0, Lakb;->a:Lakl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lakb;->b:Laka;

    iget-object v1, p0, Lakb;->a:Lakl;

    invoke-virtual {v0, v1, p1}, Laka;->a(Lakl;Landroid/os/Bundle;)V

    .line 75
    return-void
.end method
