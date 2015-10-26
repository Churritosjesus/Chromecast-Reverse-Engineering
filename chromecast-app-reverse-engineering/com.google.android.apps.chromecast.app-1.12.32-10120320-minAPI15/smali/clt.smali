.class public final Lclt;
.super Ljava/lang/Object;

# interfaces
.implements Lbwb;


# static fields
.field public static final a:Lclt;


# instance fields
.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ls;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lclu;

    invoke-direct {v0}, Lclu;-><init>()V

    invoke-virtual {v0}, Lclu;->a()Lclt;

    move-result-object v0

    sput-object v0, Lclt;->a:Lclt;

    return-void
.end method

.method constructor <init>(ZZLjava/lang/String;Ls;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lclt;->b:Z

    iput-boolean p2, p0, Lclt;->c:Z

    iput-object p3, p0, Lclt;->d:Ljava/lang/String;

    iput-object p4, p0, Lclt;->e:Ls;

    return-void
.end method
