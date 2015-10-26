.class final Lbec;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbfb;


# direct methods
.method constructor <init>(Lbdu;Lbdn;Lbfb;)V
    .locals 0

    .prologue
    .line 427
    iput-object p3, p0, Lbec;->a:Lbfb;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lbec;->a:Lbfb;

    .line 1059
    iget-object v0, v0, Lbfb;->a:Ljava/lang/String;

    .line 430
    invoke-virtual {p0, v0}, Lbec;->a(Ljava/lang/Object;)V

    .line 431
    return-void
.end method
