.class public final Lbes;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbdq;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;Lbdq;)V
    .locals 0

    .prologue
    .line 288
    iput-object p3, p0, Lbes;->a:Lbdq;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lbes;->a:Lbdq;

    .line 1472
    iget-object v0, v0, Lbdq;->a:Lbdf;

    .line 1716
    iget-object v0, v0, Lbdf;->R:Ljava/lang/String;

    .line 291
    invoke-virtual {p0, v0}, Lbes;->a(Ljava/lang/Object;)V

    .line 292
    return-void
.end method
