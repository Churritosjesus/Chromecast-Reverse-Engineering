.class public final Lber;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbdq;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;Lbdq;)V
    .locals 0

    .prologue
    .line 261
    iput-object p3, p0, Lber;->a:Lbdq;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lber;->a:Lbdq;

    .line 1472
    iget-object v0, v0, Lbdq;->a:Lbdf;

    .line 1628
    iget-object v0, v0, Lbdf;->G:Lbdj;

    .line 264
    invoke-virtual {p0, v0}, Lber;->a(Ljava/lang/Object;)V

    .line 265
    return-void
.end method
