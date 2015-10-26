.class public final Lbed;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbdo;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;Lbdo;)V
    .locals 0

    .prologue
    .line 486
    iput-object p3, p0, Lbed;->a:Lbdo;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 489
    new-instance v0, Lbev;

    invoke-direct {v0}, Lbev;-><init>()V

    .line 490
    iget-object v1, p0, Lbed;->a:Lbdo;

    .line 1064
    iget-object v1, v1, Lbdo;->a:Ljava/lang/String;

    .line 490
    iput-object v1, v0, Lbev;->a:Ljava/lang/String;

    .line 491
    iget-object v1, p0, Lbed;->a:Lbdo;

    .line 1068
    iget-object v1, v1, Lbdo;->b:Ljava/lang/String;

    .line 491
    iput-object v1, v0, Lbev;->b:Ljava/lang/String;

    .line 492
    invoke-virtual {p0, v0}, Lbed;->a(Ljava/lang/Object;)V

    .line 493
    return-void
.end method
