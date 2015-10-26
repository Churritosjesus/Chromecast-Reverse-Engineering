.class final Lblk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwh;


# instance fields
.field private synthetic a:Lbln;


# direct methods
.method constructor <init>(Lbln;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lblk;->a:Lbln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 150
    invoke-static {}, Lblj;->f()Lblp;

    .line 151
    iget-object v0, p0, Lblk;->a:Lbln;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbln;->a(Ljava/lang/String;)V

    .line 152
    return-void
.end method
