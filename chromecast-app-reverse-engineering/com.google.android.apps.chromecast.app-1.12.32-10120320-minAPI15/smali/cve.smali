.class final Lcve;
.super Lcvf;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final c:Lcxi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->j:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcve;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcxi;)V
    .locals 2

    sget-object v0, Lcve;->b:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcvf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, Lcve;->c:Lcxi;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcje;
    .locals 1

    iget-object v0, p0, Lcve;->c:Lcxi;

    invoke-virtual {v0}, Lcxi;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcyh;->f()Lcje;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
