.class final Lbao;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lblu;


# instance fields
.field private synthetic a:Lbah;


# direct methods
.method constructor <init>(Lbah;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lbao;->a:Lbah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .prologue
    .line 478
    iget-object v0, p0, Lbao;->a:Lbah;

    invoke-static {v0}, Lbah;->e(Lbah;)Lmm;

    move-result-object v0

    invoke-virtual {v0}, Lmm;->finish()V

    .line 480
    return-void
.end method
