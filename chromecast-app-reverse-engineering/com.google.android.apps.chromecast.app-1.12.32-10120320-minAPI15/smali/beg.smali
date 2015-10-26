.class public final Lbeg;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbfl;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;Lbfl;)V
    .locals 0

    .prologue
    .line 541
    iput-object p3, p0, Lbeg;->a:Lbfl;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 544
    iget-object v0, p0, Lbeg;->a:Lbfl;

    .line 1073
    iget-object v0, v0, Lbfl;->a:Lbdj;

    .line 544
    invoke-virtual {p0, v0}, Lbeg;->a(Ljava/lang/Object;)V

    .line 545
    return-void
.end method
