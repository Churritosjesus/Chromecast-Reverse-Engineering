.class public final Lbee;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbfg;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;Lbfg;)V
    .locals 0

    .prologue
    .line 504
    iput-object p3, p0, Lbee;->a:Lbfg;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 507
    new-instance v0, Lbex;

    invoke-direct {v0}, Lbex;-><init>()V

    .line 508
    iget-object v1, p0, Lbee;->a:Lbfg;

    .line 1052
    iget-object v1, v1, Lbfg;->a:Ljava/lang/String;

    .line 508
    iput-object v1, v0, Lbex;->a:Ljava/lang/String;

    .line 509
    invoke-virtual {p0, v0}, Lbee;->a(Ljava/lang/Object;)V

    .line 510
    return-void
.end method
