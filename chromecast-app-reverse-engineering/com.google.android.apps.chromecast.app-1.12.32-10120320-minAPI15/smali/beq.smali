.class final Lbeq;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbdq;


# direct methods
.method constructor <init>(Lbdu;Lbdn;Lbdq;)V
    .locals 0

    .prologue
    .line 246
    iput-object p3, p0, Lbeq;->a:Lbdq;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lbeq;->a:Lbdq;

    .line 1472
    iget-object v0, v0, Lbdq;->a:Lbdf;

    .line 249
    invoke-virtual {p0, v0}, Lbeq;->a(Ljava/lang/Object;)V

    .line 250
    return-void
.end method
