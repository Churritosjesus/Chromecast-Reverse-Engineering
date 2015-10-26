.class final Lbef;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbdn;


# direct methods
.method constructor <init>(Lbdu;Lbdn;)V
    .locals 0

    .prologue
    .line 517
    iput-object p2, p0, Lbef;->a:Lbdn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 520
    iget-object v0, p0, Lbef;->a:Lbdn;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbdn;->a(Ljava/lang/Object;)V

    .line 521
    return-void
.end method
